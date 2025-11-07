import Link  from "./link"
export default function NavBar( ) {
   
    return(
        <header className="bg-[#289FB7] h-28 w-full flex items-center justify-between px-22">
            <img src="public/logo_calouros(2).svg" alt="Nexus Homem" width={200} classname=" " />
            <div class="flex gap-8">
                <Link url="/inventario">Inventario</Link>
                <Link url="/ocorrencia">Ocorrencia</Link>
                <Link url="/pessoa">Pessoa</Link>
                <Link url="/unidade">Unidade</Link>
                
            </div>
        </header>
    )
}   