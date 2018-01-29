package com.macys.rxkataandroid;

import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

class CountriesServiceSolved implements CountriesService {

    // Note that documentation for RxJava 2 operators is often listed as TBD.  However these
    // operators are usually identical to those from RxJava 1.  When using their documentation,
    // refer to RxJava 1 operators as needed.

    @Override
    public Observable<Long> listPopulationOfEachCountry(List<Country> countries) {
        // See: http://reactivex.io/documentation/operators/map.html
        return null;
    }

    @Override
    public Observable<String> listNameOfEachCountry(List<Country> countries) {
        return null;
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillion(List<Country> countries) {
        // See: http://reactivex.io/documentation/operators/filter.html
        return null;
    }

    @Override
    public Observable<Country> listOnly3rdAnd4thCountry(List<Country> countries) {
        // See: http://reactivex.io/documentation/operators/skip.html
        // See: http://reactivex.io/documentation/operators/take.html
        return null;
    }

    @Override
    public Single<String> getCurrencyUsdIfNotFound(String countryName, List<Country> countries) {
        // Single represents an observable stream that will only return one value.  While
        // Observable accepts callbacks for onNext, onComplete, and onError, Single accepts
        // callbacks for only onSuccess and onError.  An Observable can be converted to a Single
        // with a default value using the Observable::first method.
        //
        // See further: http://reactivex.io/documentation/single.html
        return null;
    }

    @Override
    public Single<Boolean> areEmittingSameSequences(Observable<Country> countryObservable1,
                                                    Observable<Country> countryObservable2) {
        // See: http://reactivex.io/documentation/operators/sequenceequal.html
        return null;
    }

    @Override
    public Single<String> countryNameInCapitals(Country country) {
        return null;
    }

    @Override
    public Single<Integer> countCountries(List<Country> countries) {
        return null;
    }

    @Override
    public Single<Map<String, Long>> mapCountriesToNamePopulation(List<Country> countries) {
        // See: Observable::toMap
        // See: http://reactivex.io/documentation/operators/to.html
        return null;
    }

    @Override
    public Single<Boolean> isAllCountriesPopulationMoreThanOneMillion(List<Country> countries) {
        return null;
    }

    @Override
    public Maybe<Long> sumPopulationOfCountries(List<Country> countries) {
        return null;
    }

    @Override
    public Maybe<Long> sumPopulationOfCountries(Observable<Country> countryObservable1,
            Observable<Country> countryObservable2) {
        return null;
    }

    @Override
    public Observable<Country> listPopulationMoreThanOneMillionWithTimeoutFallbackToEmpty(final FutureTask<List<Country>> countriesFromNetwork) {
        // Bonus question - not required
        // Hint: if you can't figure out why your code is failing, you may be blocking your thread
        return null;
    }
}
