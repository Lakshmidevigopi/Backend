import axios from "axios";
import { useState } from "react";
import "../component/registration.css";

function Register()
{
   const [id, setId] = useState("");
   const [firstname, setFname] = useState("");
   const [lastname, setLname] = useState("");
   const [phone, setPhone] = useState("");
   const [uname, setUname] = useState("");

   async function handleSubmit(event)
    {
        event.preventDefault();
    try
        {
         await axios.post("http://localhost:8013/save", 
        {
        id: id,
        fname: firstname,
        lname : lastname,
        phone : phone,
        uname :uname 
        });
          alert("User Registation Successfully");
          setId("");
          setFname("");
          setLname("");
          setPhone("");
          setUname("");
        
        }
    catch(err)
        {
          alert("User Registation Failed");
        }
   }
    return (
        <div className="register-container">
     
            <form className="register-form" onSubmit={handleSubmit}> 
            <br></br>      
            <h1>Register</h1>
            <p>Fill in the Information Below</p>

            <input type="text" 
             name="id"
             placeholder="id"
                     
             onChange={(event) =>
              {
                  setId(event.target.value);       
              }}
            />

            <input type="text" 
            name="firstname" 
            placeholder="Firstname" 
            onChange={(event) =>
                {
                    setFname(event.target.value);       
                }}
            />

            <input type="text" 
            name="lastname"
            placeholder="lastname"
            onChange={(event) =>
                {
                    setLname(event.target.value);       
                }}           
            />

             
          
        <input type="text" 
            name="phone" 
            placeholder="phone"
            onChange={(event) =>
                {
                    setPhone(event.target.value);       
                }}           
            />

    <input type="text" 
            name="username" 
            placeholder="username"
            onChange={(event) =>
                {
                    setUname(event.target.value);       
                }}           
            />

            <button type="submit">Register</button>

    
            </form>     

     
        </div>
    )
}

export default Register;