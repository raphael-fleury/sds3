import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSuccess } from 'types/sale';
import { BASE_URL } from 'utils/requests';
import { round } from 'utils/format';

type SeriesData = {
    name: string,
    data: number[]
}

type ChartData = {
    labels: {
        categories: string[]
    },
    series: SeriesData[]
}

const BarChart = () => {
    
    const structure = {
        labels: {
            categories: []
        },
        series: [
            { name: "", data: [] }
        ]
    };

    const [chartData, setChartData] = useState<ChartData>(structure);

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`)
        .then(response => {
            const data = response.data as SaleSuccess[];
            const categories = data.map(x => x.seller.name);       
            const series = [{
                name: "% de Sucesso",
                data: data.map(x => round(x.deals / x.visited * 100, 2)) 
            }];

            setChartData({ labels: { categories }, series });
        })
    }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    }; 

    return (
        <Chart
            options= {{ ...options, xaxis: chartData.labels }}
            series = { chartData.series }
            type = "bar"
            height = "240"
        />
    );
}

export default BarChart;