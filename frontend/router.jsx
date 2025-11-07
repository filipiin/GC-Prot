import { Route, Routes } from "react-router-dom";
import { Pages } from "./src";

export function Router (){
    return (
        <Routes>
            <Route path="/" element={<Pages.Inicio/>}></Route>
            <Route path="/inventario" element={<Pages.Inventario/>}></Route>
            <Route path="/ocorrencia" element={<Pages.Ocorrencia/>}></Route>
            <Route path="/pessoa" element={<Pages.Pessoa/>}></Route>
            <Route path="/unidade" element={<Pages.Unidade/>}></Route>
        </Routes>
    )
}