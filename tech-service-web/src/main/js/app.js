'use strict'

const React = require('react');
const ReactDOM = require('react-dom');

import { NavLink } from "react-router-dom";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
// import "../resources/static/main.css";

import {Home} from "./pages";


class App extends React.Component {//https://reactjs.org/docs/react-component.html

    constructor(props) {
        super(props);
    }

    render(){
        return (
            <div className="navigation">
                <nav className="navbar navbar-expand navbar-dark bg-dark">
                    <div className="container">
                        <NavLink className="navbar-brand" to="/home">
                            React Multi-Page Website
                        </NavLink>
                        {/*<div>*/}
                        {/*    <ul className="navbar-nav ml-auto">*/}
                        {/*        <li className="nav-item">*/}
                        {/*            <NavLink className="nav-link" to="/">*/}
                        {/*                Home*/}
                        {/*                <span className="sr-only">(current)</span>*/}
                        {/*            </NavLink>*/}
                        {/*        </li>*/}
                        {/*        <li className="nav-item">*/}
                        {/*            <NavLink className="nav-link" to="/about">*/}
                        {/*                About*/}
                        {/*            </NavLink>*/}
                        {/*        </li>*/}
                        {/*        <li className="nav-item">*/}
                        {/*            <NavLink className="nav-link" to="/contact">*/}
                        {/*                Contact*/}
                        {/*            </NavLink>*/}
                        {/*        </li>*/}
                        {/*        <li className="nav-item">*/}
                        {/*            <NavLink className="nav-link" to="/blog">*/}
                        {/*                Blog*/}
                        {/*            </NavLink>*/}
                        {/*        </li>*/}
                        {/*    </ul>*/}
                        {/*</div>*/}
                    </div>
                </nav>
            </div>
        );
    }
}

ReactDOM.render(
    <Router>
        <App />
        <Routes>
            <Route path="/home" element={<Home />} />
        </Routes>
    </Router>,
    document.getElementById('react') // this is the name 'react' which connects it to the index page
);