import { ComponentProps } from "react";

interface InputProps extends ComponentProps<'input'> {}

export default function Input ( props: InputProps ){
    return(
        <input {...props} className="border-2 border-gray-500 w-full h-12 px-2 outline-none rounded-lg text-[1em] font-medium focus:border-blue-800 placeholder:text-gray-400" required></input>
    )
}