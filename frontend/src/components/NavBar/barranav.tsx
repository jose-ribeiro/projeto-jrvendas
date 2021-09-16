import bemol from 'assets/img/b.png'
;import { Link } from 'react-router-dom';


const NavBar = () => {
    return (
        <div className="navbar navbar-expand-lg navbar-light bg-light">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                <Link to="/">
                    <img src={bemol} alt="Bemol" width="120" />
                    </Link>
                        <div className="collapse navbar-collapse" id="conteudoNavbarSuportado">
                            <ul className="navbar-nav mr-auto">
                                <li className="nav-item active">
                                  <a className="nav-link" href="https://www.bemol.com.br/">Site bemol </a>
                                </li>
                                <li className="nav-item">
                                   <a className="nav-link" href="https://www.bemolfarma.com.br/">Bemol Farma</a>
                                </li>
                            </ul>
                        </div>
                </nav>
            </div>
        </div>
    );
}

export default NavBar;
