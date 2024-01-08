import {BrowserRouter, Routes, Route, Navigate} from 'react-router-dom'
import HomepageComponent from './homepage/HomepageComponent'
import HeaderComponent from './HeaderComponent'
import HomeBoardComponent from './homepage/HomeBoardComponent'
import PageNotFoundComponent from './PageNotFoundComponent'

export default function ReviewApp() {
   return (
      <div>
         <BrowserRouter>
         <HeaderComponent/>
            <Routes>
               {/* <Route path='/' element={ <HomepageComponent/> } /> */}
               <Route path='/' element={ <HomeBoardComponent/> } />
               <Route path='*' element={ <PageNotFoundComponent/> } />
            </Routes>
         </BrowserRouter>
      </div>
   )
}