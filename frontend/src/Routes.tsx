
import Dashboard from 'pages/Dashboard/tela-inicial';
import Home from 'pages/Home/home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/tela-inicial">
                    <Dashboard />
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;
