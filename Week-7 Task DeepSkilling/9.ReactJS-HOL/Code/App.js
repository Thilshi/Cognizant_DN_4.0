import React from "react";
import ListofPlayers, { Scorebelow70 } from "./Components/ListofPlayers";
import {
  OddPlayers,
  EvenPlayers,
  ListofIndianPlayers,
} from "./Components/IndianPlayers";

function App() {
  var flag = true;

  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 50 },
    { name: "Dhoni", score: 65 },
    { name: "Kohli", score: 30 },
    { name: "Pant", score: 75 },
    { name: "Hardik", score: 45 },
    { name: "Jadeja", score: 80 },
    { name: "Ashwin", score: 60 },
    { name: "Bumrah", score: 55 },
    { name: "Shami", score: 70 },
    { name: "Iyer", score: 35 },
  ];

  const IndianTeam = ["Virat", "Rohit", "Dhoni", "Kohli", "Pant", "Hardik"];
  const T20players = ["Suryakumar", "Samson"];
  const RanjiPlayers = ["Pujara", "Rahane"];

  const IndianPlayers = [...T20players, ...RanjiPlayers]; // Merge using spread

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          {OddPlayers(IndianTeam)}
          <hr />
          <h1>Even Players</h1>
          {EvenPlayers(IndianTeam)}
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;
