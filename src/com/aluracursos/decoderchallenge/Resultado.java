package com.aluracursos.decoderchallenge;

public record Resultado(double conversion_result) {

    @Override
    public double conversion_result() {
        return conversion_result;
    }
}