import React,{useState} from 'react'
import "./TweetBox.css";
import {Avatar, Button} from "@mui/material";
import db from "./firebase";


function TweetBox() {

  const [tweetMessage, setTweetMessage] = useState("");
  
  const sendTweet = (e) => {
    e.preventDefault();

    db.collection("posts").add({
      displayName: "Faraaz Khan",
      username: "faraaz_kha2",
      verified: true,
      text: tweetMessage,
      avatar:
        "https://pbs.twimg.com/profile_images/1304011493738819584/1OFxn0WO_400x400.jpg",
    });
    setTweetMessage("");
  };
  
  return (
    <div className="tweetBox">
        <form >
            <div className="tweetBox__input">
                <Avatar src="https://pbs.twimg.com/profile_images/1304011493738819584/1OFxn0WO_400x400.jpg"/>
                <input onChange={(e) => setTweetMessage(e.target.value)} 
                value={tweetMessage} placeholder="what's happening?" type="text"/>
            </div>
            
            <Button onClick={sendTweet} type="submit" className="tweetBox__tweetButton">Tweet</Button>
        </form>
      
    </div>
  )
}

export default TweetBox;
