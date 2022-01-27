import React  from "react";
import TweetBox from "./TweetBox";
import Post from "./Post";
import "./Feed.css";
// import db from "./firebase";



function Feed() {
  // const [posts, setPosts] = useState([]);

  // useEffect(() => {
  //   db.collection("posts").onSnapshot((snapshot) =>
  //     setPosts(snapshot.docs.map((doc) => doc.data()))
  //   );
  // }, []);
  
  return (
    <div className="feed">
      {/*Header*/}
      <div className="feed__header">
      <h2>Home</h2>
      </div>
      
      {/*TweetBox*/}
      <TweetBox />

      {/*posts*/}
      {/* {posts.map((post) => ( */}
        <Post
        displayName="Faraaz Khan"
            username="faraaz_kha_2"
            verified={true}
            text="This is Awesome"
            avatar="https://pbs.twimg.com/profile_images/1304011493738819584/1OFxn0WO_400x400.jpg"
            image="https://media4.giphy.com/media/0BP6TC2sPVnNFxsF96/200w.webp?cid=ecf05e47ehnayx2d5jqov7yo8tza3jy5iwt19ahu11fm6lp5&rid=200w.webp&ct=g"
        />
        <Post 
        displayName="Faraaz Khan"
        username="faraaz_kha_2"
        verified={true}
        text="This is Awesome"
        avatar="https://pbs.twimg.com/profile_images/1304011493738819584/1OFxn0WO_400x400.jpg"
        image="https://media4.giphy.com/media/0BP6TC2sPVnNFxsF96/200w.webp?cid=ecf05e47ehnayx2d5jqov7yo8tza3jy5iwt19ahu11fm6lp5&rid=200w.webp&ct=g"
    />
    <Post
    displayName="Faraaz Khan"
    username="faraaz_kha_2"
    verified={true}
    text="This is Awesome"
    avatar="https://pbs.twimg.com/profile_images/1304011493738819584/1OFxn0WO_400x400.jpg"
    image="https://media4.giphy.com/media/0BP6TC2sPVnNFxsF96/200w.webp?cid=ecf05e47ehnayx2d5jqov7yo8tza3jy5iwt19ahu11fm6lp5&rid=200w.webp&ct=g"
/>
      {/* ))}
      */}
      
    </div>
  );
}

export default Feed;
