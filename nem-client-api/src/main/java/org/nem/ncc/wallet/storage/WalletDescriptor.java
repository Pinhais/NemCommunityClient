package org.nem.ncc.wallet.storage;

import org.nem.core.serialization.SerializableEntity;
import org.nem.ncc.wallet.WalletName;

import java.io.*;

/**
 * An interface that describes a wallet.
 */
public interface WalletDescriptor extends SerializableEntity {

	/**
	 * Gets the wallet name.
	 *
	 * @return The wallet name.
	 */
	public WalletName getWalletName();

	/**
	 * Opens a read stream that can be used to read the contents of the referenced wallet.
	 *
	 * @return The input stream.
	 */
	public InputStream openRead();

	/**
	 * Opens a write stream that can be used to modify the contents of the referenced wallet.
	 *
	 * @return The output stream.
	 */
	public OutputStream openWrite();

	/**
	 * Deletes the referenced wallet.
	 */
	public void delete();
}