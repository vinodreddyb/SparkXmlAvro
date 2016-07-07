package com.telia.spark;

import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;

public class TestAvroDeSerialization {

	public static void main(String[] args) {
		try {
			Schema schema = new Schema.Parser().parse(new File("toolbox.avsc"));
			DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
			DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(
					new File("outbig/part-r-00000.avro"), datumReader);
			GenericRecord user = null;
			while (dataFileReader.hasNext()) {
				// Reuse user object by passing it to next(). This saves us from
				// allocating and garbage collecting many objects for files with
				// many items.
				user = dataFileReader.next(user);
				System.out.println(user);

			}
		} catch (Exception e) {

		}

	}
	

}
