package com.example.pokemones;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokemonApi {
    @GET("pokemon")
    Call<PokemonResponse> getPokemonList(
            @Query("limit") int limit,
            @Query("offset") int offset
    );
}
