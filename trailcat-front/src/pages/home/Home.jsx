import React, { useState, useEffect } from "react";
import "./Home.css";
import axios from "axios";

export default function Home() {
  const [races, setRaces] = useState([]);

  useEffect(() => {
    loadRaces();
  }, []);

  const loadRaces = async () => {
    const result = await axios.get("http://localhost:8090/public");
    setRaces(result.data);
  };

  return (
    <div className="container">
      <div className="py-4">
        <table className="table">
          <thead>
            <tr>
              <th scope="col">Race name</th>
              <th scope="col">Distance</th>
              <th scope="col">Slope</th>
              <th scope="col">Where</th>
              <th scope="col">When</th>
            </tr>
          </thead>
          <tbody>
            {races.map((race) => {
              return (
                <tr>
                  <td>{race.name}</td>
                  <td>{race.distance}</td>
                  <td>{race.slope}</td>
                  <td>{race.location}</td>
                  <td>{race.date}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </div>
    </div>
  );
}
