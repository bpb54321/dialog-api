package com.brianblosser.dialogapi;

import com.brianblosser.dialogapi.dialog.Dialog;
import org.springframework.data.repository.CrudRepository;

public interface DialogRepository extends CrudRepository<Dialog, Long> {
}
