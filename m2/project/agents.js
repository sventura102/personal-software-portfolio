
let currentDate = new Date();
document.querySelector('#year').textContent = currentDate.getFullYear();

let baseURL = 'https://valorant-api.com/v1/agents?isPlayableCharacter=true';
async function getAgents(baseURL) {
    let response = await fetch(baseURL);
    let data = await response.json();
    agentsList = data;
    output(agentsList);
}

function output(agentsList) {
    console.log(agentsList);
    let outputElement = document.getElementById('agents');
    let agentList = agentsList.data;
    let select = document.getElementById('select');
    agentList.forEach(agent => {
        let html = `<img src="${agent.fullPortrait}" alt="${agent.displayName}"/> <h2>${agent.displayName}</h2> <h3>${agent.description}</h3> <h3>${agent.role.displayName}</h3>`
        outputElement.innerHTML += html;
    });

};

getAgents(baseURL);
output();