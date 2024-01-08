import { useEffect, useState } from "react"
import { retrieveAllPost } from "../api/BoardApiService"

export default HomeBoardComponent

function HomeBoardComponent() {

   const [posts, setPosts] = useState([])
   const [post, setPost] = useState()

   function refreshPost() {
      retrieveAllPost()
      .then((response) => {
         setPosts(response.data)
      })
      .catch((error) => console.log(error))
   }

   useEffect( () => refreshPost(), [])
   return(
      <div>
         <table className="table">
            <thead>
               <tr>
                  <th>category</th>
                  <th>title</th>
                  <th>content</th>
                  <th>writer</th>
                  <th>createTime</th>
               </tr>
            </thead>
            <tbody>
               {
                  posts.map(
                     post => (
                        <tr key={post.postId}>
                           <td> {post.category} </td>
                           <td> {post.title} </td>
                           <td> {post.content} </td>
                           <td> {post.userId} </td>
                           <td> {post.createdTime} </td>
                        </tr>
                     )
                  )
               }
            </tbody>
         </table>
      </div>
   )
}