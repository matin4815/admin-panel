package com.matin.adminpanel.service.comment;

import com.matin.adminpanel.dto.ChangeCommentStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;

public interface ProductCommentService {

    Boolean changeProductCommentSetting(ProductDisplayDto productDisplayDto);

    Boolean changeCommentsStatus(ChangeCommentStatusDto changeCommentStatusDto);
}
