import './HomepageComponent.css'

export default HomepageComponent

function HomepageComponent() {

   return(
      <div className="center">     
         <div className="Layout-module_column_left">
            <div className="Layout-module_column_left_box">
               <div>
                  <a href="http://www.naver.com">naver</a>
               </div>
               <div className="clear_fix">
                  <div className="test_float">
                     <div>
                        <input type="text"></input>
                        </div>
                     <div>
                        <input type="text"></input>
                        </div>
                  </div>
                  <div className="test_float">
                     <button>Login</button>
                  </div>
               </div>
            </div>
         </div>
         
         <div className="Layout-module_column_right">
            <div className="Layout-module_column_right_box">
               <div className="MyView-module_my_login_left">
                  <div className="MyView-module_my_login">
                     <input type="text"></input>
                  </div>
                  <div className="MyView-module_my_login">
                     <input type="text"></input>
                  </div>
               </div>
               <div className="MyView-module_my_login_right">
                  <button>Login</button>
               </div>
               <div className="MyView-module_undermenu">
                  <a href="http://www.naver.com" className="MyView-module_undermenu_more">아이디 찾기</a>
                  <a href="http://www.naver.com" className="MyView-module_undermenu_more">비밀번호 찾기</a>
                  <a href="http://www.naver.com" className="MyView-module_undermenu_more">회원가입</a>
               </div>
            </div>
         </div>
      </div>
   )
}