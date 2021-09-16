import axios from "axios";
import Pagination from "components/Pagination/page";
import { useEffect, useState } from "react";
import { DadosPage } from "types/AtendimentosCidade";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DataTable = () => {

    const [activePage, setActivePage] = useState(0);
    const [page, setPage] = useState<DadosPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/dados?page=${activePage}&size=10&sort=date,desc`)
            .then(response => {
                setPage(response.data);
            });
    }, [activePage]);

    const changePage = (index: number) => {
        setActivePage(index);
    
    }

    return (
        <>
            <Pagination page={page} onPageChange={changePage}/>
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Cidade</th>
                            <th>Atendimentos</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{formatLocalDate(item.date, "MM/yyyy")}</td>
                                <td>{item.cidade.name}</td>
                                <td>{item.atendimentos}</td>
                                <td>{item.valor}</td>

                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>

    );
}

export default DataTable;