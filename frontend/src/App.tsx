import BarChart from "components/BarChart/graficobarra";
import DataTable from "components/DataTable/tabela";
import DonutChart from "components/DonutChart/graficorosca";
import Footer from "components/Footer/rodape";
import NavBar from "components/NavBar/barranav";

function App() {
  return (
  <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Painel de vendas Interior Amazonas</h1>

        <div className="row px-3">
            <div className="col-sm-6">
              <h5 className='text-center text-secondary'>Taxa de Sucesso</h5>
             <BarChart />
            </div>
           <div className="col-sm-6">
            <h5 className='text-center text-secondary'>Taxa de sucesso</h5>
            <DonutChart />
           </div>
          </div>

          <div className="py-3">
            <h2 className="text-primary">Todas as vendas</h2>
          </div>

        <DataTable />
      </div>
      <Footer />
  </>
  );
}
export default App;
