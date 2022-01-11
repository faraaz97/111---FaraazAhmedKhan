import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// function based component and class based component difference is -->state
// function based component are stateles
// class based component are stateful

// React Hooks
//  technique to use stateful behaviour in function based components
// useState Hook
// Returns a stateful value, and a function to update it.
// Returns a stateful value, and a function to update it.

 class SignUp extends React.Component{
       constructor(props){
         super(props);
         this.state = {stname:'',lname:'',newPass:'',phoneNumber:'',DOB:'',Gender:"", ispass:true};
         this.handleChange = this.handleChange.bind(this);
         this.handleSubmit = this.handleSubmit.bind(this);
       }

       handleChange(event){
         this.setState({value: event.target.value});
         const target = event.target;
         const value = target.name === "isPass" ? target.checked: target.value;
         const name = target.name;

         console.log(name +" "+ value);
         this.setState({[name]:value});
       }

       handleSubmit(event){
         alert('Are you sure you want to submit? '+this.state.stname+" "+ this.state.isPass+" "+this.state.noOfAttempts);
         event.preventDefault();
       }


       render(){
         return(

           <form onSubmit={this.handleSubmit}>
             <div>
             <b><label>
               User Name:
               <input name="stname" type="email" value={this.state.stname} onChange={this.handleChange}/>
             </label>
             </b>
             </div>
             <div>
             <b>
             <label>
               New Password:
               <input name="newPass" type="password" value={this.state.newPass} onChange={this.handleChange}/>
             </label>
             </b>
             </div>
             <div>
             <b>
             <label>
               Phone Number:
               <input name="phoneNumber" type="number" value={this.state.phoneNumber} onChange={this.handleChange}/>
             </label>
             </b>
             </div>
             <div>
             <b>
             <label>
               DOB
               <input name="DOB" type="date" value={this.state.DOB} onChange={this.handleChange}/>
             </label>
             </b>
             </div>
             <div>
             <b>
             <label>
             <div>
           <select name="Gender" value={this.state.Gender} onChange={this.handleChange} aria-label="Default select example">
             <option value="m">Male</option>
             <option value="f">Female</option>
             <option value="o">Other</option>
           </select>
           </div>
             </label>
             </b>
             </div>
             <div>
             <b>
             <label>
               condition accept?
               <input name="isPass" type="checkbox" checked={this.state.isPass} onChange={this.handleChange}/>
             </label>
             </b>
             </div>
             <input type="submit" value="Submit" />
           </form>

         );
       }
     }

     ReactDOM.render(
       <SignUp /> ,
     document.getElementById('root')
   );