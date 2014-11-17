package com.freedom.messagebus.client;

import com.freedom.messagebus.business.message.model.Message;

/**
 * message receive listener interface
 */
public interface IMessageReceiveListener {

    public void onMessage(Message message, IReceiverCloser consumerCloser);

}
