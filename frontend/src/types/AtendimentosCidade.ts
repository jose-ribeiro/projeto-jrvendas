import { Cidade } from "./Cidade"

export type SomaCidades = {
    nomeCidade: string,
    sum: number,
}
export type Success = {
    nomeCidade: string;
    atendimentos: number;
   
}

export type DadosPage = {
    content?: Dados[];
    last: boolean;
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}
export type Dados = {
    id: number;
    atendimentos: number;
    valor: number;
    date: string;
    cidade: Cidade;
} 
