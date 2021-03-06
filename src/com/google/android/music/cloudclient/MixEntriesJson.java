package com.google.android.music.cloudclient;

import com.google.android.music.sync.google.model.Track;
import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public class MixEntriesJson extends GenericJson
{

  @Key("entries")
  public List<Track> mEntries;
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     com.google.android.music.cloudclient.MixEntriesJson
 * JD-Core Version:    0.6.2
 */