export default function Link( {children,url} ){

    return(
        <a href={url} className="text-white font-bold">{children}</a>

    )
    
}