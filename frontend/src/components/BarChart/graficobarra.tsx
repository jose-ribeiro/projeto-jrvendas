import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/requests';
import { Success } from 'types/AtendimentosCidade';

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
}

const BarChart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []                   
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/dados/sucess-vendedores`)
            .then(Response => {
                const data = Response.data as Success[];
                const myLabels = data.map(x => x.nomeCidade);
                const mySeries = data.map(x => x.atendimentos);

                setChartData({
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "% Success",
                            data: mySeries                   
                        }
                    ]
                });
            });
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
            options ={{...options, xaxis: chartData.labels}}
            series={chartData.series}
            type="bar"
            height="300"
        />       
    );
}

export default BarChart;