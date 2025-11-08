import Input from "../components/input"
import NavBar from "../components/navbar"
import TituloInput from "../components/titulo_input"
export default function Inventario (){

    return (
        <div className='h-screen w-full flex flex-col bg-[#f1fdff]'>
            <NavBar></NavBar>
            <div className="flex-1 justify-center flex items-center">
                <div className="h-[80%] bg-white w-[80%] rounded-lg shadow-xl p-12 flex flex-col">
                    <h1 className="text-slate-600 font-bold text-[2rem] mb-16">Cadastrar Inventario</h1>
                    <form className="w-full flex-1 grid grid-cols-3">
                        <label htmlFor="name" className="flex flex-col gap-2">
                            <TituloInput>Nome</TituloInput>
                            <Input type="text" id="name" name="name" placeholder="Ex: Porronto"></Input>
                        </label>
                    </form>
                </div>
            </div>
        </div>
    )
}