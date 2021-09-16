import BarChart from "components/BarChart/graficobarra";
import DataTable from "components/DataTable/tabela";
import DonutChart from "components/DonutChart/graficorosca";
import Footer from "components/Footer/rodape";
import NavBar from "components/NavBar/barranav";

;

const Dashboard = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas</h1>

                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Atendimentos </h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas vendas</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Todas vendas</h2>
                </div>

                <DataTable />
            </div>
            <div className="menu">
            <Footer />
            </div>
        </>
    );
}

export default Dashboard;
