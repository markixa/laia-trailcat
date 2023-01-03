import './App.css';
//import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from './layout/navbar/Navbar';
import Home from './pages/home/Home';
import Footer from './layout/footer/Footer';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Home/>
      <Footer />
    </div>
  );
}

export default App;
