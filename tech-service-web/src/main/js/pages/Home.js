import React from "react";
const client = require('./../client')

class Home extends React.Component{

    constructor(props){
        super(props);
        this.state = {items: []}
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/repairItems'}).done(response => {
            this.setState({
                //._embedded.value is very important, you need the crrect name here!!
                items: response.entity._embedded.repairItems
            });
        });
    }

    render(){
        return(
            <div className="home">
                <div class="container">
                    <div class="row align-items-center my-5">
                        <div class="col-lg-7">
                            <img
                                class="img-fluid rounded mb-4 mb-lg-0"
                                src="http://placehold.it/900x400"
                                alt=""
                            />
                        </div>
                        <div class="col-lg-5">
                            <h1 class="font-weight-light">Clients Items</h1>
                            <p>
                                See all your items to fix
                            </p>
                            <ItemList items = {this.state.items}/>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

class ItemList extends React.Component{

    render(){
        const items = this.props.items.map(item =>
            //below is where the Item class is recieving its individual prop
            <Item key = {item._links.self.href} item = {item}/>);
        return(
            <table>
                <tbody>
                <tr>
                    <th>Repair ID</th>
                    <th>Client</th>
                    <th>Description</th>
                </tr>
                    {items}
                </tbody>
            </table>
        );
    }
}

class Item extends React.Component{
    render(){
        return(
            <tr>
                <td>{this.props.item.id} </td>
                <td>{this.props.item.owner} </td>
                <td>{this.props.item.itemDescription}</td>
            </tr>
        );
    }
}

export default Home ;
//function Home(){
//
//         return(
//             <div className="home">
//                 <div class="container">
//                     <div class="row align-items-center my-5">
//                         <div class="col-lg-7">
//                             <img
//                                 class="img-fluid rounded mb-4 mb-lg-0"
//                                 src="http://placehold.it/900x400"
//                                 alt=""
//                             />
//                         </div>
//                         <div class="col-lg-5">
//                             <h1 class="font-weight-light">Home</h1>
//                             <p>
//                                 See all your items to fix
//                             </p>
//                         </div>
//                     </div>
//                 </div>
//             </div>
//         );
// }
//
// export default Home;


