import { Link } from "react-router-dom"

export default HeaderComponent

function HeaderComponent() {
   return(
      <div>
         <Link to='/write'>
            <h1>write</h1>
         </Link>
      </div>
   )
}