import axios from 'axios';

const url = "https://localhost:8080";

export const savePost = async (payload) => {
    try {
        return await axios.post(`${url}`, payload);
    } catch (error) {
        console.log("Error: ", error.message);
        return error.response.data;
    }
}