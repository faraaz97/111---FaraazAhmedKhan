import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//class based components in React
//working with handlers

class MySwitch extends React.Component{

  constructor(props){
    super(props);  
    this.state = {isOn : true};    
    this.myHandler = this.myHandler.bind(this);
  }

  myHandler(){
    //how do we change the state
    //this.state.isOn = false;
    this.setState( i => (
      {isOn: !i.isOn}
    ));
  }

  render(){
    return (
      <button onClick={this.myHandler}>{this.state.isOn ? 'ON':'OFF'}</button>
    );
  }
}

ReactDOM.render(
  <MySwitch/>,
  document.getElementById('root')
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();