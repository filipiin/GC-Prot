import { useForm } from "react-hook-form"
import Input from "../components/input"
import NavBar from "../components/navbar"
import TituloInput from "../components/titulo_input"

export default function Pessoa (){

    const { register, handleSubmit } = useForm()

    function Submit ( data ) {
        
        var dados = {
            "name": data.name,
            "date_of_bith": data.date_of_bith,
            "cpf": data.cpf,
            "email": data.email,
        }
        
        console.log(dados)

    }

    return (
        <div className='h-screen w-full flex flex-col bg-[#f1fdff]'>
            <NavBar></NavBar>
            <div className="flex-1 justify-center flex items-center">
                <form onSubmit={handleSubmit(Submit)} className="h-[80%] bg-white w-[80%] rounded-lg shadow-xl p-20 flex flex-col justify-between">
                    <h1 className="text-slate-600 font-bold text-[2rem]">Cadastrar Pessoa</h1>
                    <div className="w-full grid grid-cols-3 gap-x-5 gap-y-18">
                        <label htmlFor="name" className="flex flex-col gap-2 col-span-2">
                            <TituloInput>Nome</TituloInput>
                            <Input {...register("name")} type="text" id="name" name="name" placeholder="Ex: Porronto"></Input>
                        </label>
                        <label htmlFor="date_of_bith" className="flex flex-col gap-2">
                            <TituloInput>Data de Nascimento</TituloInput>
                            <Input {...register("date_of_bith")} type="date" id="date_of_bith" name="date_of_bith"></Input>
                        </label>
                        <label htmlFor="cpf" className="flex flex-col gap-2">
                            <TituloInput>CPF</TituloInput>
                            <Input {...register("cpf")} type="text" id="cpf" name="cpf" placeholder="Ex: 123.230.430-21"></Input>
                        </label>
                        <label htmlFor="email" className="flex flex-col gap-2 col-span-2">
                            <TituloInput>Email</TituloInput>
                            <Input {...register("email")} type="email" id="email" name="email" placeholder="Ex: coconutdosport@gmail.com"></Input>
                        </label>
                    </div>
                    <div className="flex justify-end my-3">
                        <button className="h-10 w-45 bg-[#289FB7] rounded-lg text-white font-bold cursor-pointer hover:bg-[#2890a5]
                        ">Cadastrar</button>
                    </div>
                </form>
            </div>
        </div>
    )
}