package com.freedom.messagebus.business.message.transfer;


import com.freedom.messagebus.business.message.model.MessageType;
import com.freedom.messagebus.business.message.transfer.bodytransfer.BroadcastMsgBodyTransfer;
import com.freedom.messagebus.business.message.transfer.bodytransfer.PubSubMsgBodyTransfer;
import com.freedom.messagebus.business.message.transfer.bodytransfer.QueueMsgBodyTransfer;

public class MessageBodyTransferFactory {

    public static IMessageBodyTransfer createMsgBodyProcessor(MessageType messageType) {
        IMessageBodyTransfer processor = null;
        switch (messageType) {
            case QueueMessage:
                processor = new QueueMsgBodyTransfer();
                break;

            case AuthreqMessage:

                break;

            case AuthrespMessage:

                break;

            case PubSubMessage:
                processor = new PubSubMsgBodyTransfer();
                break;

            case BroadcastMessage:
                processor = new BroadcastMsgBodyTransfer();
                break;

        }

        return processor;
    }

}
