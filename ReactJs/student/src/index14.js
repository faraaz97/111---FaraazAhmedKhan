import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


//working with forms
//forms always maintain state
//by controlled components

class MyForm extends React.Component{
  constructor(props){
    super(props);
    this.state = {value:''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  handleChange(event){
    this.setState({value:event.target.value});
  }
  handleSubmit(event){
    alert('Are you sure? '+ this.state.value);
    event.preventDefault();
  }
  render(){
    return (
    <form  onSubmit ={this.handleSubmit}>
     
      <label>
         Name: <input type ="text" value = {this.state.value} onChange={this.handleChange}></input>
      </label>
      <input type = "submit" value="submit"/>
    </form>
    );
  }
}


ReactDOM.render(
  <MyForm />,
  document.getElementById('root')
);
