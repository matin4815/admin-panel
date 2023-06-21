package com.matin.adminpanel.service.vote;

import com.matin.adminpanel.dto.ChangeVoteStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;

public interface ProductVoteService {

    Boolean changeProductVoteSetting(ProductDisplayDto productDisplayDto);

    Boolean changeVotesStatus(ChangeVoteStatusDto changeVoteStatusDto);
}
