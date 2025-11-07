import { useState } from 'react'
import NavBar from '../components/navbar'

export default function Inicio() {
    const [count, setCount] = useState(0)

    return (
        <div className='h-screen w-full bg-[#FAF0CA]'>
            <NavBar></NavBar>
        </div>
    )
}