import { apiClient } from "./ApiClient"

export const retrieveAllPost = () => apiClient.get(`/testHome`)