package org.nhindirect.common.tx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javax.mail.internet.MimeMessage;

import org.nhindirect.common.tx.model.TxMessageType;

public class TxUtil_getMessageTypeTypeTest 
{
	@Test
	public void testGetMessageType_DSNMessage() throws Exception
	{
		MimeMessage msg = TestUtils.readMimeMessageFromFile("DSNMessage.txt");
		
		assertEquals(TxMessageType.DSN, TxUtil.getMessageType(msg));
	}
	
	@Test
	public void testGetMessageType_MDNMessage() throws Exception
	{
		MimeMessage msg = TestUtils.readMimeMessageFromFile("MDNMessage.txt");
		
		assertEquals(TxMessageType.MDN, TxUtil.getMessageType(msg));
	}
	
	@Test
	public void testGetMessageType_SMIMEMessage() throws Exception
	{
		MimeMessage msg = TestUtils.readMimeMessageFromFile("SMIMEMessage.txt");
		
		assertEquals(TxMessageType.SMIME, TxUtil.getMessageType(msg));
	}
	
	@Test
	public void testGetMessageType_IMFMessage() throws Exception
	{
		MimeMessage msg = TestUtils.readMimeMessageFromFile("MessageWithAttachment.txt");
		
		assertEquals(TxMessageType.IMF, TxUtil.getMessageType(msg));
	}
}
