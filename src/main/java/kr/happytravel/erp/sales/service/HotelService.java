package kr.happytravel.erp.sales.service;

import kr.happytravel.erp.sales.dto.CountryDto;
import kr.happytravel.erp.sales.dto.HotelDto;

import java.util.List;
import java.util.Map;

public interface HotelService {
    // 호텔 전체 조회
    List<HotelDto> getHotelList(Map<String, Object> paramMap) throws Exception;

    // 호텔 수 조회
    int getHotelCnt(Map<String, Object> paramMap) throws Exception;

    String getLastHotelCode() throws Exception;

    // 호텔 단건 조회
    HotelDto selectHotel(Map<String, Object> paramMap) throws Exception;

    // 호텔 단건 등록
    int insertHotel(Map<String, Object> paramMap) throws Exception;

    // 호텔 단건 수정
    int updateHotel(Map<String, Object> paramMap) throws Exception;

    // 호텔 단건 삭제
    int updateHotelYN(Map<String, Object> paramMap) throws Exception;

    List<CountryDto> getCountries (Map<String, Object> paramMap) throws Exception;
}