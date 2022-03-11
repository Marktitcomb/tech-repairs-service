'use strict'

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {owners: []};
    }
    //is the API invoked after React renders a component in the DOM.
    componentDidMount() {
        //so your client gets the /api/employees
        //and when its done
        //set the react employees variable to the repsonse.entity._embedded.employees
        client({method: 'GET', path: '/api/repairItems'}).done(response => {
            this.setState({
                //._embedded.value is very important, you need the crrect name here!!
                owners: response.entity._embedded.repairItems
            });
        });
    }
    render(){
        return(
            //populating the employees list class with props and passing it down
            <OwnerList owners = {this.state.owners}/>
        )
    }
}

class OwnerList extends React.Component{
    render(){
        //mapping a function to each changing it to html class Employee
        const owners = this.props.owners.map(owner =>
            <Owner key = {owner._links.self.href} owner = {owner}/>);

        return (
            <table>
                <tbody>
                <tr>
                    <th>First Name</th>
                </tr>
                {owners}
                </tbody>
            </table>
        )

    }
}

//so rather than give employee its own state we start from the top and pass it all down
class Owner extends React.Component{
    render(){
        return(
            <tr>
                <td>{this.props.owner.itemDescription}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)