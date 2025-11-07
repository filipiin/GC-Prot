import NavBar from "../components/navbar"
export default function Inventario (){

    return (
        <div className='h-screen w-full flex flex-col bg-[#f1fdff]'>
            <NavBar></NavBar>
            <div className="flex-1 justify-center flex items-center">
                <div className="h-[80%] bg-white w-[80%] rounded-lg shadow-xl p-12">
                  <h1 className="text-black font-bold">Cadastrar Inventario</h1>
                </div>
            </div>
        </div>
    )
}