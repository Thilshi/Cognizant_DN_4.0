// components/IndianPlayers.js
import React from "react";

export const OddPlayers = (players) => {
  const oddPlayers = players.filter((_, index) => index % 2 !== 0);
  return (
    <ul>
      {oddPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
};

export const EvenPlayers = (players) => {
  const evenPlayers = players.filter((_, index) => index % 2 === 0);
  return (
    <ul>
      {evenPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
};

export const ListofIndianPlayers = ({ IndianPlayers }) => {
  return (
    <div>
      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};
