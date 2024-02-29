import axios from 'axios';

const url = "http://localhost:8080";

export const savePost = async (payload) => {
    try {
        return await axios.post(`${url}/post`, payload);
    } catch (error) {
        console.log("Error: ", error.message);
        return error.response.data;
    }
}
export const getAllPosts = async () => {
    try {
        return await axios.get(`${url}/posts`);
    } catch (error) {
        console.log("Error: ", error.message);
        return error.response.data;
    }
}