// components/ListofPlayers.js
import React from "react";

const ListofPlayers = ({ players }) => {
  return (
    <div>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export const Scorebelow70 = ({ players }) => {
  const filteredPlayers = players.filter((player) => player.score < 70);

  return (
    <div>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
