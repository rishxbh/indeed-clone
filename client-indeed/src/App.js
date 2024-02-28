import './App.css';
import Home from './pages/Home';
import {Routes, BrowserRouter as Router, Route} from 'react-router-dom';
import { routePath } from './routes/route';
import CreatePost from './pages/CreatePost';
function App() {
  return (
    <Router>
      <Routes>
        <Route path={routePath.home} element= {<Home/>} />
        <Route path={routePath.create} element= {<CreatePost/>} />
      </Routes>
    </Router>
  );
}

export default App;
