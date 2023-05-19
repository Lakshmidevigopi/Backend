import Register from "./pages/registration";

import './App.css';
import {BrowserRouter,Routes,Route} from "react-router-dom";

function App() {
  return (
    <div className="App">
       <BrowserRouter>
        <Routes>
          <Route path="/" exact>
          
               <Register/>
               
          </Route>
      </Routes>
    </BrowserRouter>
    </div>
  );
}

export default App;