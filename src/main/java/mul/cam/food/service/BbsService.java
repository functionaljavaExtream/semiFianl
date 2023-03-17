package mul.cam.food.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.JsonObject;

import mul.cam.food.dto.BbsComment;
import mul.cam.food.dto.BbsDto;
import mul.cam.food.dto.BbsParam;
import mul.cam.food.dto.MemberDto;

public interface BbsService {

	boolean bbswrite(BbsDto dto);

	List<BbsDto> getlist();
	
	// searchResult
	List<BbsDto> getSearchList(BbsParam param);

	JsonObject SummerNoteImageFile(MultipartFile file);


	BbsDto getBbs(int seq);
	
	boolean commentWrite(BbsComment bbs);

	
}
